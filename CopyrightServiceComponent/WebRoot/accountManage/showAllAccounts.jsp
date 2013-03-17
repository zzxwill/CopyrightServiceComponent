<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8"%>
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
		<title>版权人信息查看</title>
		<script type="text/javascript">
     	function deleteAccount(id)
     	{
     		location.href="delete.action?id="+id;
     	}
    	</script>
	</head>
	<body>

		<s:form name="thisForm" theme="simple">


			<table>
				
				
				<tr>
				<td>
					<%-- Test:${arrayList.get(0).getEmailAddress()} --%>
					
					</td>
				</tr>

				<tr>



					<td width="40%">
						序号
					</td>
					<td width="40%">
						名字
					</td>
					<td width="40%">
						姓氏
					</td>
					<td width="40%">
						邮箱
					</td>
					<td width="40%">
						操作
					</td>
				</tr>
				<%
					List<Account> accountList = (ArrayList<Account>) request
								.getAttribute("ArrayList");
						int i;
						for (i = 0; i < accountList.size(); i++) {
				%>
				<tr>
					<td width="40%">
						<input type="text" value="<%=accountList.get(i).getId()%>" />
					</td>
					<td width="40%">
						<!-- s:textfield name="arrayList.get(i).getFirstName()" / -->
						<input type="text" value="<%=accountList.get(i).getFirstName()%>" />
					</td>
					<td width="40%">
						<input type="text" value="<%=accountList.get(i).getLastName()%>" />
					</td>
					<td width="40%">
						<input type="text"
							value="<%=accountList.get(i).getEmailAddress()%>" />
					</td>
					<td>
						<input type="button" value="删除"
							onClick="deleteAccount(<%=accountList.get(i).getId()%>)" />
					</td>

				</tr>
				<%
					}
				%>




			</table>




		</s:form>
	</body>
</html>
