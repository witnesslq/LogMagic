package com.logMagic.server.jfinal.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller{
	public void index() {
		render("/index.vm");
	}
}
