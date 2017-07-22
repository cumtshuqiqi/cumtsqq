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
		<form action="update" method="post">
        <h2 class="form-signin-heading">修改密码</h2>
        <label for="inputEmail" class="sr-only">请输入你的用户名</label>
        <div class="form-group">
        <input type="text" id="inputEmail" class="form-control" name="user_id" value="${sessionScope.user.user_id }" placeholder="用户ID" required autofocus>
        </div>
        
        <label for="inputEmail" class="sr-only">请输入你密码</label>
        <div class="form-group">
        <input type="password" id="inputEmail" class="form-control" name="password" value="${sessionScope.user.password}" placeholder="密码" required>
        </div>
        
		<a href="update"><button class="btn btn-lg btn-primary btn-block"  type="submit">修改密码</button></a>
		<div>
     	</div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>