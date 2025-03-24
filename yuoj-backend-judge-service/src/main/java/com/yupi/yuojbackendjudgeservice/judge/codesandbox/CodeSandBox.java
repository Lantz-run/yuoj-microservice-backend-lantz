package com.yupi.yuojbackendjudgeservice.judge.codesandbox;

/**
 * <p>Project: yuoj-backend
 * <p>Powered by Lantz On 2025/2/7
 *
 * @author Lantz
 * @version 1.0
 * @Description CodeSandBox
 * @since 1.8
 */


import com.yupi.yuojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandBox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
