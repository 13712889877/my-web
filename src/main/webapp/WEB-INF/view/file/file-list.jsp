<%@ page import="com.cg.entity.FilePath" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World!</h2>
<table>
    <thead>
    <tr>
        <th>序号</th>
        <th>文件名称</th>
        <th>文件路径</th>
        <th>文件类型</th>
        <th >操作</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<FilePath> list = (List<FilePath>) request.getAttribute("fileList");
        for (int i = 0; i < list.size(); i++) {
            FilePath  path= list.get(i);
    %>
        <td><%=i%></td>
        <td><%=path.getName()%></td>
        <td><%=path.getPath()%></td>
        <td><%=path.getType()%></td>
        <td><a
                href="<%=request.getContextPath()%>/File?method=delete&path=<%=path.getPath()%>"><input
                class="btn_s" type="button" value="删除" /></a></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
