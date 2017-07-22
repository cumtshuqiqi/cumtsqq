
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
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="grid.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="css/pants.css" rel="stylesheet">
  </head>

  <body>
<div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#"> Happy  购物网</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li ><a href="shop">主页</a></li>
                <li><a href="ours">关于我们</a></li>
                <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.user.loginname}<span class="caret"></span></a>
          <ul class="dropdown-menu ">
            <li><a href="collect">收藏</a></li>
            <li><a href="cart">购物车</a></li>
            <li><a href="order">订单</a></li>
            <li><a href="#">在线${applicationScope.count}人</a></li>
            <li><a href="index">注销</a></li>
          </ul>
        </li>
                 <form class="navbar-form navbar-left">
           			 <div class="form-group" >
              			 <input type="text" class="form-control"  placeholder="查询">
            		</div>
        			<button type="submit" class="btn btn-default">搜索</button>
      			</form>
                <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">分类 <span class="caret"></span></a>
          <ul class="dropdown-menu ">
            <li><a href="skirt">裙子</a></li>
            <li><a class="active" href="coat">上衣</a></li>
            <li><a  href="pants">裤子</a></li>
            <li><a href="shoe">鞋子</a></li>
          </ul>
        </li>
      </ul>
             
            </div>
          </div>
        </nav>

      </div>
    </div>
    <h3>Happy 购物网</h3>
      <p>你的选择，我们的骄傲</p>
		<table class="table table-striped" >
                <tr>
                <td width="200px">商品编号</td>
                <td class="pants">商品名称</td>
                <td class="pants">商品图片</td> 
                <td class="pants">商品类型</td>
                <td class="pants">商品价格</td>
                <td class="pants">购买数量</td>
                <td class="pants">物流信息</td>
            	</tr>
            <tr>
                
                <td>${good.good_id}</td>
                <td>${good.good_name}</td>
                <td><img src="img/${good.good_image}"></td>
                <td>${good.good_type}</td>
                <td><font color="red">￥${good.good_price}</font></td>
                <td>${order.good_count}</td> 
                <td>${order.good_info}</td> 
            </tr>
        </table>
		<form action="comment" method="post">
		<table class="table table-hover" >
		<tr><td>店铺评分</td>
		<td>1分</td>
		<td>2分</td>
		<td>3分</td>
		<td>4分</td>
		<td>5分</td></tr>
		
		<tr><td>描述相符</td>
		<td><label class="radio-inline">
  			<input type="radio" name="description" id="inlineRadio1" value="1"> 1
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="description" id="inlineRadio1" value="2"> 2
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="description" id="inlineRadio1" value="3"> 3
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="description" id="inlineRadio1" value="4"> 4
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="description" id="inlineRadio1" value="5" > 5
		</label></td></tr>
		
		<tr><td>物流服务</td>
		<td><label class="radio-inline">
  			<input type="radio" name="logistics" id="inlineRadio1" value="1"> 1
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="logistics" id="inlineRadio1" value="2"> 2
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="logistics" id="inlineRadio1" value="3"> 3
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="logistics" id="inlineRadio1" value="4"> 4
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="logistics" id="inlineRadio1" value="5"> 5
		</label></td></tr>
		
		<tr><td>服务态度</td>
		<td><label class="radio-inline">
  			<input type="radio" name="service" id="inlineRadio1" value="1"> 1
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="service" id="inlineRadio1" value="2"> 2
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="service" id="inlineRadio1" value="3"> 3
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="service" id="inlineRadio1" value="4"> 4
		</label></td>
		<td><label class="radio-inline">
  			<input type="radio" name="service" id="inlineRadio1" value="5"> 5
		</label></td></tr>
		
		</table>
		<button class="btn btn-lg btn-success btn-block" type="submit">评论</button>
		</form>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
