<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<div class="panel panel-primary">
	</div>
	<div class="container">
		<div class="row">
			<form action="login" method="post">
				<div class="form-group">
					<div class="input-group col-md-4">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<input class="form-control" placeholder="用户名" type="text" name="userName">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group col-md-4">
						<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
						<input class="form-control" placeholder="密码" type="password" name="passWord">
					</div>
				</div>
				<div class="btn-group">
					<button type="submit" class="btn btn-success" id="loginbtn">
						<span class="glyphicon glyphicon-log-in"></span>&nbsp;登录
					</button>
				</div>
				<div class="btn-group">
					<button type="submit" class="btn btn-success" id="loginbtn">
						<span class="glyphicon glyphicon-log-in"></span>&nbsp;注册
					</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
