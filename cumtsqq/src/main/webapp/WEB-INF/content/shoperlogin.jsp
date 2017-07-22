<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Happy 购物网</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<link href="css/login.css" rel="stylesheet">
  </head>
  <body>
   <div class="container">

      <form class="form-signin" action="shoperlogin" type="post">
        <h2 class="form-signin-heading">Happy 购物网</h2>
        <label for="inputEmail" class="sr-only">用户ID</label>
        <input type="text" id="inputEmail" class="form-control" name="shoper_id" value="${sessionScope.shoper.shoper_id}" placeholder="用户ID" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" name="shoper_password" value="${sessionScope.shoper.shoper_password}" placeholder="密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="记住密码">记住密码
          </label>
          <a href="login"><button type="button" class="btn btn-link">我是客户</button></a>
          
        </div>
        <button class="btn btn-lg btn-success btn-block" type="submit">登录</button>
		<a href="register"><button class="btn btn-lg btn-primary btn-block"  type="submit">用户注册</button></a>
		<a href="find"><button type="button" class="btn btn-link">忘记密码?</button></a>
		<button type="button" class="btn btn-link">修改密码</button>
		</form>
        

    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>