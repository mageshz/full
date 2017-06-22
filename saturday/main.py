#!/usr/bin/env python
#
# Copyright 2007 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
import webapp2
import os
import json
import hashlib
from google.appengine.ext.webapp import template
from google.appengine.ext import ndb

pat=os.path.join("C:\Users\User.FULL280-WIN.002\Desktop\My projectss\saturday","templates\home.html")
sign=os.path.join("C:\Users\User.FULL280-WIN.002\Desktop\My projectss\saturday","templates\signup.html")
log=os.path.join("C:\Users\User.FULL280-WIN.002\Desktop\My projectss\saturday","templates\login.html")
tin=os.path.join("C:\Users\User.FULL280-WIN.002\Desktop\My projectss\saturday","templates\welcome.html")

def encode(String):
    return hashlib.md5(String).hexdigest()

class PostDb(ndb.Model):
    title=ndb.StringProperty()
    content=ndb.StringProperty()

    @classmethod
    def register(cls,utitle,ucontent):
        return PostDb(
            title=utitle,
            content=ucontent

        )

class UserDb(ndb.Model):
    user=ndb.StringProperty()
    password=ndb.StringProperty()
    email=ndb.StringProperty()

    @classmethod
    def register(cls,name,pas,email):
        return UserDb(

            user=name,
            password=pas,
            email=email

                )

    @classmethod
    def email(cls, user, encopwd):
        di = UserDb.query()
        did = di.filter(UserDb.user == user)
        for i in did:
            original = i.password
            mail_pre=i.email
            if (encopwd == original):
                return mail_pre

    @classmethod
    def by_name(cls,name):
        u=UserDb.query()
        k=u.filter(UserDb.user==name)
        for i in k:
            result=i.user
            return result
    # @classmethod
    # def by_pas(cls,pas):
    #     v=UserDb.all().filter('password',pas).get()
    #     return v
    @classmethod
    def login(cls,user,encopwd):
        di = UserDb.query()
        did = di.filter(UserDb.user == user)
        for i in did:
            original=i.password
            if(encopwd==original):
               return "yes"
            else:
               return "no"




class MainHandler(webapp2.RequestHandler):
    def get(self):
        Iscookie=self.request.cookies.get("user")
        if not Iscookie:
            self.response.out.write(template.render(pat, self))
        else:

            self.redirect('/welcome')
    def post(self):
        login=self.request.get("login")
        signup=self.request.get("signup")
        if(login):
              self.redirect('/login')
        if(signup):
              self.redirect('/signup')


class SignupHandler(webapp2.RequestHandler):
    def get(self):

        self.response.out.write(template.render(sign, self))
        namea=self.request.get("name")
    def post(self):

        er=self.request.get("err_name")
        user=self.request.get("uname")
        pas = self.request.get("pas")
        email = self.request.get("mail")
        self.response.out.write(user)
        #enco_pas=encode(pas)
        # if(er=='false'):
        #     value={'val':"user regiestered successfully go to the login page"}
        #     io=json.dumps(value)
        #     self.response.out.write(io)
        #     a=UserDb.register(user, enco_pas, email)
        #     a.put()
        # else:
        #     value={'val':"User is not Registered Retry again with valid details"}
        #     io=json.dumps(value)
        #     self.response.out.write(io)

        # self.response.out.write("the error val is "+er)
        # # nam=self.request.get("uname")
        # dic={'name':"user registered successfully"}
        #
        # if(er=='false'):
        #     mydic = {'value': "user registered successfully go to the login page"}
        #     k = json.dumps(mydic)
        #     self.response.out.write(k)

            # v="success registration"

            #use dom elements to send data
            #self.response.out.write(template.render(sign,dic))
            # self.response.out.write("dfsdfadsfdfegrewf")
        # else:
        #     dictionary = {'value': "Retry user is not registered"}
        #     v = json.dumps(dictionary)
        #     self.response.out.write(v)

            # UserDb.register(user,pas,email)


             # dictionary={'value':"Registeration not done Retry again"}
             # v=json.dumps(dictionary)
             # v="retry again to register"


             # self.response.set_cookie('user', nam)
             # self.response.out.write("error")
             #  self.redirect("/signup")

             # else:
        # self.response.out.write(template.render(sign,"user registered successfully"))
        # user=json.self.request.get("name")
        # password=self.request.get("password")
        # encoded=encode(password)
        # data=userDb()
        # data.user=user
        # data.password=encoded
        # data.put()
        # self.response.out.write("user registered successfully check it in datastore")

class LoginHandler(SignupHandler):
    def get(self):
        self.response.out.write(template.render(log,self))
    def post(self):
        username=self.request.get("uname")
        password=self.request.get("pas")
        encoded=encode(password)
        val={'u':username}
        a=json.dumps(val)
        self.response.out.write(a)
        # m=SignupHandler.email
        # enc_mail=encode(m)
        # self.response.out.write("the result is "+m)
        # isPresent=UserDb.by_name(username)
        # self.response.out.write(isPresent)
       #  if isPresent:
       #      out=UserDb.login(username,encoded)
       #      if(out=='yes'):
       #          get_mail=UserDb.email(username,encoded)
       #          enc_mail=encode(str(get_mail))
       #          self.response.set_cookie('user',enc_mail)
       #          # self.redirect('/welcome?uname='+username)
       #          msg={'uname':username}
       #          # self.response.out.write(template.render(tin,msg))
       #          self.redirect('/welcome')
       #      else:
       #          self.redirect('/login')
       #  else:
       #      self.response.out.write("user is not registered go to the signup form for the registration")
       #  # =============================
       #  # di=UserDb.query()
       #  # did=di.filter(UserDb.user==username)
       #  # self.response.out.write(did)
       #  # if  not did:
       #  #     self.redirect('/login')
       #  # else:
       #  # for i in did:
       #  #         original=i.password
       #  #         if(encoded==original):
       #  #                  self.response.set_cookie('user',username)
       #  #                  self.redirect('/welcome')
       #  #         else:
       #  #                   self.redirect('/login')
       #
       #  # e=self.response.set_cookie('user',username)
       #  # self.response.out.write(e)
       #  # self.redirect('/welcome')
       #  #self.redirect('/welcome')
       #  # if(e):
       #
       #  # if(user already have cookie):
       #  #     go to the same welcome page using same cookie
       #  # else:
       #
       #  # uenco=encode(username)
       #  # self.response.delete_cookie("user")
       #  # ses=sessions.Session()
       #  # ses['usersession']=username
       # # self.response.set_cookie('user', username)
       #  #self.response.out.write(template.render(tin,self))
       #
       #
       #  # res=userDb.query()
       #  # specific=res.filter(userDb.user == username)
       #  #
       #  # for i in specific:
       #  #     db_pass=i.password
       #  # if(encoded==db_pass):
       #  #     self.redirect('/welcome')
       #  # else:
       #  #     self.response.out.write("User name and Password mismatched try again to Login")

class WelcomeHandler(webapp2.RequestHandler):
    def get(self):
            isCookie=self.request.cookies.get("user")
            if isCookie:
                value=""
                self.response.out.write(template.render(tin, value))
            else:
                self.redirect('/')
                # u=self.request.get("username")
                # self.response.out.write(u)

    def post(self):
        title=self.request.get("titlecontent")
        posts=self.request.get("content")
        if title and posts:
            a=PostDb.register(title,posts)
            a.put()
            value=PostDb.query()

            self.response.out.write(template.render(tin,{'value':value}))
           #  di={"sdfd","sddddfd","sd"}
           #  self.render('welcome.html',posts)
            # self.response.out.write(template.render(tin,di))
        # self.response.out.write("the output is"+data)
        # a=self.request.get("data")
        # self.response.out.write("is it working"+a)
        # n=self.request.get("name")
        # self.response.out.write("the name  is"+n)
        # values=self.request.POST
       #self.response.out.write("inside post")
       # self.request.out.write("testing sample files slfklf ldfjdlkfjdlf ldkjf;dslf ")
       #  val=self.request.get("data")
       #  self.response.out.write(""+val)
       #  self.response.out.write("this is sample testing for ajax jquery qorking or not")
        # self.response.out.write("adkjsdlkfsdf;dfjladskfjdskl");


app = webapp2.WSGIApplication([
    ('/', MainHandler),('/login',LoginHandler),('/signup',SignupHandler),('/welcome',WelcomeHandler)
], debug=True)
