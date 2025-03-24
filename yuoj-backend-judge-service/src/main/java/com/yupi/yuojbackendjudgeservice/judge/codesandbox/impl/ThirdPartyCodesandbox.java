package com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl;

/**
 * <p>Project: yuoj-backend
 * <p>Powered by Lantz On 2025/2/8
 *
 * @author Lantz
 * @version 1.0
 * @Description CodeSandBoxImpl
 * @since 1.8
 */

import com.yupi.yuojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.yupi.yuojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodesandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
