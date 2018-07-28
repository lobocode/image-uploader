<html>
  <head>
         <title>Image Uploader</title>
  </head>
  <body>
  <h3> Image-uploader </h3>
<form enctype="multipart/form-data" action="http://127.0.0.1:9090/" method="post">
          {{/* 1. File input */}}
          <input type="file" name="uploadfile" />
 
          {{/* 2. Submit button */}}
          <input type="submit" value="upload" />
      </form>
 
  </body>
  </html>