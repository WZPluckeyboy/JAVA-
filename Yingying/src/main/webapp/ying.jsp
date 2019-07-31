<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ying</title>
    <style type="text/css">
        #main{
            width: 600px;
            height: 400px;
            border: 2px solid #000;
            margin: 200px 0 0 600px;
            background: url(img/img/ying.jpg) no-repeat center center;
        }
        #userName{
            margin: 100px 0 0 100px;
        }
        #usrePwd{
            margin: 20px 0 0 100px;
        }
        #btn{
            margin: 20px 0 0 150px;
        }
        #regbtn{
            margin-left:30px ;
        }
        #nameInput{
            background: url(img/img/head.png) no-repeat;
            padding-left:30px;
        }
        #pwdInput{
            background: url(img/img/key.jpg) no-repeat;
            padding-left:30px;
        }
    </style>
</head>
<body>
<div id="main">
    <form  action="Sersr">
        <div id="userName">
            用户名：<input id="nameInput" type="text" name="name"/>
        </div>
        <div id="usrePwd">
            密&nbsp;&nbsp;码	:&nbsp;&nbsp;&nbsp;<input id="pwdInput" type="password" name="password" />
        </div>
        <div id="btn">
            <input type="submit" value="登录" />
            <input type="button" value="立即注册" id="regbtn" />
        </div>
    </form>

</div>
</body>
</html>