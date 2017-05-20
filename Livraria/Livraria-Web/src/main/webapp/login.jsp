<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
		<div class="container">
			<div>
				<div class="col-md-4 col-md-offset-4" style="margin-top: 20%;">
					<div class="panel panel-default">
						<div class="panel-heading">
							<span class="glyphicon glyphicon-lock"></span>Login</div>
						<div class="panel-body">
							<form class="form-horizontal" method="post" action="Login" role="form">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">Login:</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" name="login" placeholder="login" required="required" autofocus="autofocus">
								</div>	
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label">Password:</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" name="senha" placeholder="senha" required>
								</div>
							</div>	
							<div class="form-group last">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-success btn-sm">Sign in</button>
									<button type="reset" class="btn btn-default btn-sm">Reset</button>
								</div>
							</div>
							</form>
						</div>
						<div class="panel-footer" style="text-align:center;font-size: 12px;">
							Livraria 3way - Fone: (99) 9999-9999
						</div>
					</div>
				</div>
		</div>
	</div>	
</body>
</html>