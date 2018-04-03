<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@include file="myvars.jsp" %>

<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="extfiles.jsp" %>
        <title>Add Brand</title>
    </head>
    <body>
     <%@include file="header.jsp" %>
     
     
     
<!-- //header -->
<!-- banner -->
	<div class="banner10" id="home1">
		<div class="container">
			<h2>Add Brand</h2>
		</div>
	</div>
<!-- //banner -->

<!-- breadcrumbs -->
	<div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Add Brand</li>
			</ul>
		</div>
	</div>
<!-- //breadcrumbs -->

<!-- mail -->
	<div class="mail">
		<div class="container">
			<h3>Add Brand</h3>
			<div class="register">
                <form action="#" method="post" enctype="multipart/form-data">			
                        <input placeholder="Brand Name" name="brandname" type="text" required=""><br/><br/>	
                      
                        <input type="file" name="brandpic" class="form-control">	
                        <div class="sign-up">
                            <input type="submit" value="Add Brand" name="submit"/>
          
        
        <%
        String bname="" ,imagename="", path="";
        boolean successful=true;
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
              
        if(isMultipart==true)
        {

            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
           try
           {
                items = upload.parseRequest(request);
           }
           catch (FileUploadException e)
           {
               e.printStackTrace();
           }

           for(FileItem myitem:items)
           {
                if (myitem.isFormField())
                {
                    String itemName1 = myitem.getFieldName();
                    String value=myitem.getString();//it will value of field
                    if(itemName1.equals("brandname")) //control's name - textbox name
                    {
                        bname=value;
                    }
                }
                else
                {
                        String type=myitem.getContentType();
                       
                        long size=myitem.getSize()/1024; //kbytes

                        if(size==0)
                        {
                            imagename="noimagefound.jpg";
                        }
                        else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                || type.equals("image/png") || type.equals("image/x-png")
                                || type.equals("image/gif")))
                            {
                        imagename=new java.util.Date().getTime()+myitem.getName();
                        path=config.getServletContext().getRealPath("/") + "uploads\\" + imagename;
                        File savefile=new File(path);
                        
                        myitem.write(savefile);    
                        }
                        else
                        {
                            successful=false;
                            out.println("Sorry only pictures are allowed to upload");
                        }
                }
            }
           if(successful==true)
           {
               try
                {
                   Class.forName("com.mysql.jdbc.Driver");
                   
                   Connection myconn = DriverManager.getConnection(dbpath, dbuser, dbpass);
                   try
                   {
                        String q = "insert into addbrand(brandname,brandpic) values(?,?)";
                        PreparedStatement myst =  myconn.prepareStatement(q);
                        myst.setString(1, bname);
                        myst.setString(2, imagename);
                        int res = myst.executeUpdate();
                        if(res==1)
                        {
                             out.print("Brand added successfully");
                        }
                        else
                        {
                             out.print("Brand not added successfully");
                        }
                   }
                   catch(Exception e)
                   {
                       out.print("Error in query " + e.getMessage());
                   }
                   
            }
            catch(Exception e)
            {
                out.print("Error in connection " + e.getMessage());
            }
           }
        }
        %>
        
        
        
        
        
                        </div>
                </form>
        </div>
		</div>
	</div>
     
       


     
     <%@include file="footer.jsp" %>
    </body>
</html>
