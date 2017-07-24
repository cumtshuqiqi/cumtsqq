<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Happy 购物网</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/warning.js"></script>
    <link href="css/pants.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Happy 购物网管理员界面</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="shoperlogin">注销</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            
            <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">商品管理<span class="caret"></span></a>
          <ul class="dropdown-menu ">
            <li><a href="good">全部商品</a></li>
            <li><a href="goodskirt">裙子</a></li>
            <li><a href="goodcoat">上衣</a></li>
            <li><a href="goodpants">裤子</a></li>
            <li><a href="goodshoe">鞋子</a></li>
          </ul>
        </li>
            <li><a href="goodadd">添加商品</a></li>
            <li><a href="goodorder">订单管理</a> </li>
            <li><a href="shoperlogin">注销</a></li>
          </ul>
          
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Happy 购物网</h1>
          <div class="table-responsive">
          <form method="post" action="goodupdate">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>商品名称</th>
                  <th>商品图片</th>
                  <th>产商</th>
                  <th>商品类型</th>
                  <th>商品库存</th>
                  <th>商品价格</th>
                  <th>商品介绍</th>
                  <th>更新</th>
                </tr>
              </thead>
              <tbody>
              	<tr>
                  <td>${good.good_name}</td>
                  <td><img class="picture" src="img/${good.good_image}"></td>
                  <td>${good.good_shoper}</td>
                  <td>${good.good_type}</td>
                  <td>${good.good_count}</td>
                  <td>${good.good_price}</td>
                  <td>${good.good_intro}</td>
                  <td></td>
                <tr>
                  <td><input class="goodaddinput" type="text"  name="good_name"></td>
                  <td><input class="goodaddinput" type="text" name="good_image"></td>
                  <td><input class="goodaddinput" type="text" name="good_shoper"></td>
                  <td><input class="goodaddinput" type="text" name="good_type"></td>
                  <td><input class="goodaddinput" type="text" name="good_count"></td>
                  <td><input class="goodaddinput" type="text" name="good_price"></td>
                  <td><input class="goodaddinput" type="text" name="good_intro"></td>
                  <td>
                  <input type="hidden" value="${good.good_id }" name="good_id">
                  <input class="btn btn-success" type="submit" ></td>
                  
                </tr>
              </tbody>
            </table>
            </form>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="js/holder.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/workaround.js"></script>
  </body>
</html>
 