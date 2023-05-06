<%@ page import ="java.sql.*"%>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
int mobile=request.getParameter("mobile");
String dob=request.getParameter("dob");

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");
    PreparedStatement ps=conn.prepareStatement("insert into form(username,password,mobile,dob) values(?,?,?,?) ");
    ps.setString(1,username);
    ps.setString(2,password);
    ps.setInt(3,mobile);
    ps.setString(4,dob);
   int x=ps.executeUpdate();
    if(x>0){
    out.println("registation done sucessfully)";
}else{
   out.println("Regisation failure");
}
catch(Exception e){
  out.println(e);
}
%>