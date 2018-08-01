package com.mypurecloud.sdk.v2;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.internal.TestResult;

public class InvokedMethodListener implements IInvokedMethodListener {
    private Boolean hasFailure = false;
    private String failureMethodName = "";

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult result) {
        if (hasFailure) {
            // https://github.com/cbeust/testng/issues/1632
            // Bug in testng is causing skips to be reported as failures in afterInvocation
            result.setStatus(TestResult.SKIP);

            throw new SkipException("Skipping " + method.getTestMethod().getMethodName() + " due to failed test: " + failureMethodName);
        } else {
            System.out.println(ConsoleColors.applyTag(ConsoleColors.CYAN_BOLD, "TEST") +  method.getTestMethod().getMethodName());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult result) {
        if (result.getStatus() == TestResult.SUCCESS) {
            System.out.println(ConsoleColors.applyTag(ConsoleColors.GREEN_BOLD, "SUCCESS") + method.getTestMethod().getMethodName());
        } else if (result.getStatus() == TestResult.SKIP) {
            System.out.println(ConsoleColors.applyTag(ConsoleColors.YELLOW_BOLD, "SKIPPED") + method.getTestMethod().getMethodName());
        } else if (result.getStatus() == TestResult.FAILURE) {
            System.out.println(ConsoleColors.applyTag(ConsoleColors.RED_BOLD, "FAILED") + method.getTestMethod().getMethodName());
            hasFailure = true;
            failureMethodName = method.getTestMethod().getMethodName();
        }
    }
}
