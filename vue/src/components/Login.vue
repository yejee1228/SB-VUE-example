<template>
<div class="login">
<div class="loginForm">
				<h3><img src="../assets/resources/img/login/loginTit.gif" alt="로그인"></h3>
				<div class="idBox">
					<label for="input_id" class="loginLabel"><img src="../assets/resources/img/login/login_id.gif" alt="아이디" class="am"></label>
					<input type="text" name="i_sMemberId" class="input_id am" id="input_id" value="">&nbsp;&nbsp;
				</div>
				<div class="paddBox">
					<label for="input_pass" class="loginLabel"><img src="../assets/resources/img/login/login_pass.gif" alt="패스워드" class="am"></label>
					<input type="password" name="i_sPassWord" class="input_pass am" id="input_pass" value="" maxlength="20" onkeydown="fnEnterLogIn(event);">&nbsp;&nbsp;
					<span class="idSave">
						<input type="checkbox" class="am" id="id_save" name="id_save" value="Y">
						<label for="id_save" class="id_save">아이디 저장</label>
					</span>
					<a href="javascript:fnLogIn();"><img src="../assets/resources/img/login/loginBtn.gif" alt="로그인" class="am"></a>
				</div>
				<div class="findjoin">
					<a href="/user/idInf.do">아이디 찾기</a> <a href="/user/passInf.do">비밀번호 찾기</a>
				</div>
				
					<div class="snsjoin">
						<a href="javascript:naverLogin('hcrrofmqpl8kc0bh2iildg0tmf')"><img src="../assets/resources/img/login/social/naver_login.jpg" width="109" height="28" alt="네이버로그인"></a>
						<a id="custom-login-btn" href="javascript:kakaoLogin()"><img src="../assets/resources/img/login/social/kakao_login.jpg" width="109" height="28" alt="카카오톡로그인"></a> 
						
					</div>
				
				
				<p class="skjoin">아직 K Car 회원이 아니세요? <a href="/user/user_policyAgree.do">회원가입</a></p>
			</div>
</div>
</template>
<script></script>
<style scoped>
.am {
    vertical-align: middle!important;
}
img, fieldset {
    border: 0;
    margin: 0;
    padding: 0;
}
.idSave {
    position: absolute;
    top: -30px;
    left: 280px;
}
.loginForm {
    width: 375px;
    margin: 0 auto;
}
form, ul, ol, dl, table, div, h1, h2, h3, h4, h5, h6 {
    margin: 0;
    padding:
}
.loginForm h3 {
    padding: 35px 0 15px 0;
    text-align: center;
}
h1, h2, h3, h4, h5, h6 {
    font-size: 12px;
    text-decoration: none;
    font-weight: normal;
}
form, ul, ol, dl, table, div, h1, h2, h3, h4, h5, h6 {
    margin: 0;
    padding: 0;
}
.idBox, .paddBox {
    position: relative;
    padding: 2px 0 2px 0;
}
.loginLabel {
    display: inline-block;
    width: 55px;
}
.input_id {
    width: 200px;
    height: 33px;
    padding: 2px 0 0 4px;
    border: 1px solid #bebebe;
}

.am {
    vertical-align: middle!important;
}
input {
    font-size: 12px;
}
.input_pass {
    width: 200px;
    height: 33px;
    padding: 2px 0 0 4px;
    border: 1px solid #bebebe;
}
.findjoin {
    padding: 5px 0 20px 65px;
}
.findjoin a {
    padding: 2px 10px 4px 20px;
    color: #999;
}
.snsjoin {
    padding: 10px 0 10px 0;
    text-align: center;
}
.loginForm .skjoin {
    padding: 12px 0;
    text-align: center;
}
p {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
}
.loginForm .skjoin a {
    font-weight: bold;
    color: #da2727;
    text-decoration: underline;
}
.login {
    padding: 20px 0 30px 0;
    border: 1px solid #e7e7e7;
    overflow: hidden;
    *zoom: 1;
}
</style>