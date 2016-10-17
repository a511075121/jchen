<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 9 ]><html class="ie9"><![endif]-->
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="description" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>管理系统</title>
            
        <!-- CSS -->
        <link href="../../../assert/global/css/bootstrap.min.css" rel="stylesheet">
        <link href="../../../assert/global/css/form.css" rel="stylesheet">
        <link href="../../../assert/global/css/style.css" rel="stylesheet">
        <link href="../../../assert/global/css/animate.css" rel="stylesheet">
        <link href="../../../assert/global/css/generics.css" rel="stylesheet"> 
        <style type="text/css">
        	.red{
        		color:red;
        	}
        	.margin-top-10{
        		margin-top:10px;
        	}
        </style>
    </head>
    <body id="skin-blur-violate">
        <section id="login">
            <header>
                <h1>管理系统</h1>
                <p>鹅，鹅，鹅，曲项向天歌。白毛浮绿水，红掌拨清波。</p>
            </header>
        
            <div class="clearfix"></div>
            
            <!-- Login -->
            <form class="box tile animated active" id="box-login" action="/login" method="post">
                <h2 class="m-t-0 m-b-15">登录帐号</h2>
                <input type="text" class="login-control m-b-10" placeholder="请输入用户名" name="username">
                <input type="password" class="login-control" placeholder="请输入密码" name="password">
                <input type="text" class="login-control m-b-10 margin-top-10" placeholder="请输入验证码" name="image">
                <img src="/login/image" id="code" onclick="reloadcode()" style="cursor: pointer; margin-top: 15px;" alt="看不清楚,换一张" name="看不清楚,换一张" />
				<p class="red">${fail }</p>
                <button class="btn btn-sm m-r-5">登录</button>
                
                <!-- <small>
                    <a class="box-switcher" data-switch="box-register" href="">Don't have an Account?</a> or
                    <a class="box-switcher" data-switch="box-reset" href="">Forgot Password?</a>
                </small> -->
            </form>
            
            <!-- Register -->
            <!-- <form class="box animated tile" id="box-register">
                <h2 class="m-t-0 m-b-15">Register</h2>
                <input type="text" class="login-control m-b-10" placeholder="Full Name">
                <input type="text" class="login-control m-b-10" placeholder="Username">
                <input type="email" class="login-control m-b-10" placeholder="Email Address">    
                <input type="password" class="login-control m-b-10" placeholder="Password">
                <input type="password" class="login-control m-b-20" placeholder="Confirm Password">

                <button class="btn btn-sm m-r-5">Register</button>

                <small><a class="box-switcher" data-switch="box-login" href="">Already have an Account?</a></small>
            </form> -->
            
            <!-- Forgot Password -->
            <!-- <form class="box animated tile" id="box-reset">
                <h2 class="m-t-0 m-b-15">Reset Password</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla eu risus. Curabitur commodo lorem fringilla enim feugiat commodo sed ac lacus.</p>
                <input type="email" class="login-control m-b-20" placeholder="Email Address">    

                <button class="btn btn-sm m-r-5">Reset Password</button>

                <small><a class="box-switcher" data-switch="box-login" href="">Already have an Account?</a></small>
            </form> -->
        </section>                      
        
        <!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="../../../assert/global/js/jquery.min.js"></script> <!-- jQuery Library -->
        
        <!-- Bootstrap -->
        <script src="../../../assert/global/js/bootstrap.min.js"></script>
        
        <!--  Form Related -->
        <script src="../../../assert/global/js/icheck.js"></script> <!-- Custom Checkbox + Radio -->
        
        <!-- All JS functions -->
        <script src="../../../assert/global/js/functions.js"></script>
        <script type="text/javascript">
			function reloadcode() {
				var verify = document.getElementById('code');
				verify.setAttribute('src', '/login/image/'
						+ parseInt(Math.random() * 100000));
			}
		</script>
    </body>
</html>
