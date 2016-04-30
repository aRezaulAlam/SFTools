package com.agroho.controller;

import com.agroho.model.FileBucket;
import com.agroho.model.MultiFileBucket;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import static sun.plugin2.util.PojoUtil.toJson;

/**
 * Created by rezaul on 4/28/16.
 */
@Controller
public class FileUploadController {


    @RequestMapping(value = "/uploadMyFile", method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(@RequestParam("name") String names,
                                   @RequestParam("file") MultipartFile files)
            throws Exception {
        // Iterator<String> itrator = request.getFileNames();
        MultipartFile multiFile = files;
        String name = names;
        try {
            // just to show that we have actually received the file
            System.out.println("File Length:" + multiFile.getBytes().length);
            System.out.println("File Type:" + multiFile.getContentType());
            String fileName=multiFile.getOriginalFilename();
            System.out.println("File Name:" +fileName);
            //String path=request.getServletContext().getRealPath("/");
            String workingDir = "/home/rezaul/Dev";
            //making directories for our required path.
            byte[] bytes = multiFile.getBytes();
           // String fileLoc = "~/Dev/Files/";
          /*  File directory=    new File(workingDir+ "/uploads");
            directory.mkdirs();*/

            File file=new File(workingDir+System.getProperty("file.separator")+fileName);
            System.out.println("File Name: "+name+"  -> "+workingDir+System.getProperty("file.separator")+fileName);
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(file));
            stream.write(bytes);
            stream.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new Exception("Error while loading the file");
        }
        return ("File Uploaded successfully.");
    }


  }
