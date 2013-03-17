<%@ page language="java" import="info.zzxwill.ssi4freshman.bean.*"
	contentType="text/html;charset=UTF-8"%>
<%
	/*工程的名字：  /SSI4Freshman   */
	String path = request.getContextPath();
	/*request.getScheme():http	 *request.getServerName():ip  	 **/
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		<title>版权人信息提交</title>
		<script type="text/javascript">
		//alert("start");
		function setValue(){
		
		
		/*获取url传值*/
		var firstName;
var hrefstr,pos,parastr,para,tempstr;
   hrefstr = window.location.href;
   pos = hrefstr.indexOf("?");
   parastr = hrefstr.substring(pos+1);
   para = parastr.split("&");
   tempstr="";
   for(i=0;i<para.length;i++)
   {
    tempstr = para[i];
    pos = tempstr.indexOf("=");
    if(tempstr.substring(0,pos) == "firstName")
    {
     firstName =  tempstr.substring(pos+1);
    // return;
     }
   }
   
		
		
		
     		document.getElementById("firstName").value= firstName;
     	}
     	//document.getElementsByName("account.firstName")[0].value="abc";
    	</script>
    	

	</head>
	<body onload="setValue()">
		<s:form name="thisForm" theme="simple" action="addAccount"
			namespace="/">
		<table>
				<tr>
					<td width="40%">
						名字
						<!-- 
						<s:textfield name="account.firstName" id="firstname"></s:textfield>
						 -->
						<input type="text" name="account.firstName" id="firstName">
					</td>
				</tr>
				
				<tr>
					<td width="40%">
						<s:submit value="提交"></s:submit>
					</td>
				</tr>
				
				
				
			</table>
		</s:form>
	</body>
</html>
