package com.ly.agrManader.web;

import com.ly.agrManader.web.model.JsonModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @ControllerAdvice 描述的类为全局异常处理类
      假如XxxController类的方法出现了异常，
 * 此异常又没有try{}catch操作，而是继续抛出了，这个异常会抛出给controller
 * 方法调用者(DispatcherServlet),此对象会检测抛出异常的controller类中
 * 是否有定义异常处理方法，这个方法能够处理抛出的异常，假如不可以，那么
 * DispatcherServlet对象还会检测是否有全局的异常处理类，假如有则调用
 * 全局异常处理类中的相关异常处理方法处理异常。
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	


	/**
	 * @ExceptionHandler 注解描述的方法为控制层的异常处理方法,此注解
	 * 中传入的异常类型，为它描述的方法可以处理的异常。
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public JsonModel doHandleRuntimeException(RuntimeException e) {
		System.out.println("GlobalExceptionHandler.doHandleRuntimeException");
		e.printStackTrace();





		return JsonModel.fail(e);
	}
	
}
