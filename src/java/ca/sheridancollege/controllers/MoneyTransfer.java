/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controllers;

import java.io.IOException;
import java.io.StringWriter;
import static java.lang.System.out;

import javax.servlet.jsp.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;
/**
 *
 * @author gurpreet
 */
public class MoneyTransfer extends SimpleTagSupport {

  private String from;
  private String to;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public MoneyTransfer() {
    }
  
   StringWriter sw= new StringWriter();
  @Override
   public void doTag() throws JspException, IOException {
       getJspBody().invoke(sw);
   
   JspWriter out= getJspContext().getOut();
   out.println(sw.toString() + from + " to " + to );

   }
}
