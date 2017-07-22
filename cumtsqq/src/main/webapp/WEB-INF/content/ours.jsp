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
    <link href="css/index.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  //<nav class="navbar navbar-default navbar-fixed-top">
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
                <li><a href="ours" class="active" >关于我们</a></li>
                <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的<span class="caret"></span></a>
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
            <li><a href="shirt">裙子</a></li>
            <li><a href="coat">上衣</a></li>
            <li><a href="pants">裤子</a></li>
            <li><a href="shoe">鞋子</a></li>
          </ul>
        </li>
      </ul>
             
            </div>
          </div>
        </nav>

      </div>
    </div>
</nav>

    <!-- Carousel
    ================================================== -->
    <div class="container">
      <div class="page-header">
	  </br>
	  </br>
	  </br>
	  </br>
        <h1>Happy 购物网</h1>
      </div>
      <p class="lead">我们是一群热爱生活的大学生，我们爱美，但不张扬；我们很乖巧，但也很叛逆；我们很文艺，但我们也时尚。我们，我们是一群正处于青春年华的少年！我们很Happy! </p>
    </div>

     <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">返回顶部</a></p>
        <p>&copy; Happy 购物网,站点作者：舒琪琪; 邮箱：1454867406@qq.com</p>
	   </footer>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
     
     
     
