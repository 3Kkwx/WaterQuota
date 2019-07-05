<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css" />
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">用水检测系统</h3>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<form action="login" method="post">
				<div class="form-group">
					<div class="input-group col-md-4">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-user"></i></span> <input class="form-control"
							placeholder="用户名" type="text" name="UserName"
							style="width: 269px; ">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group col-md-4">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-lock"></i></span> <input class="form-control"
							placeholder="密码" type="password" name="UserPassWord"
							style="width: 270px; ">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group col-md-4">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-lock"></i></span> <select
							style="width: 268px; ">
							<option>请选择</option>
							<option>管理员</option>
							<option>评估公司</option>
							<option>自测用户</option>
						</select>
					</div>
				</div>
				<div class="btn-group">
					<button type="submit" class="btn btn-success" id="loginbtn"
						style="width: 129px; ">
						<span class="glyphicon glyphicon-log-in"></span>&nbsp;登录
					</button>
					<input type="button" value="注册" onclick="window.location.href='register.jsp'"/>
				</div>
				<div class="btn-group"></div>
			</form>
		</div>
	</div>
</body>
</html>