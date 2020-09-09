  package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Quiz;
import com.app.service.QuizService;

@Component
public class DBInitializer implements CommandLineRunner{
	private QuizService service;
	public DBInitializer(QuizService service) {
		this.service=service;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Quiz quiz1 =new Quiz("In which decade was the American Institute of Electrical Engineers (AIEE) founded?","1850s\n" + "\n" +"","1880s"," 1930s","1950s",2);
		Quiz quiz2 =new Quiz("What is part of a database that holds only one type of information?"," Report","Field","Record","File",2);
		Quiz quiz3 = new Quiz("'OS' computer abbrevation usually means?","Order of Significance"," Open Software"," Operating System","Optical Sensor",3);
		Quiz quiz4=new Quiz( "In which decade with the first transatlantic radio broadcast occur?", " 1850s", "1860s", "1870s", "1900s", 4);
		Quiz quiz5=new Quiz("'.MOV' extension refers usually to what kind of file?","Image file", "Animation/movie file", " Audio file", "MS Office document", 2);
		Quiz quiz6=new Quiz( "Who developed Yahoo?", "Dennis Ritchie & Ken Thompson", "David Filo & Jerry Yang", "Vint Cerf & Robert Kahn","Steve Case & Jeff Bezos", 2);
		Quiz quiz7=new Quiz("Which is a type of Electrically-Erasable Programmable Read-Only Memory?", "Flash  ", "Flangue   ", "Fury  ", "FRAM", 1);
		Quiz quiz8=new Quiz("Light travels at the fastest speed in", "glass", "water", "hydrogen", "vacuum", 4);
		Quiz quiz9=new Quiz("The purpose of choke in tube light is ? ", "To decrease the current  ", "To increase the current", "To decrease the voltage momentarily", "To increase the voltage momentarily", 4);
		Quiz quiz10=new Quiz("'.MPG' extension refers usually to what kind of file?", "	WordPerfect Document file  ", "MS Office document  ", "Animation/movie file  ", "Image file", 3);
		this.service.saveQuiz(quiz1);
		this.service.saveQuiz(quiz2);
		this.service.saveQuiz(quiz3);
		this.service.saveQuiz(quiz4);
		this.service.saveQuiz(quiz5);
		this.service.saveQuiz(quiz6);
		this.service.saveQuiz(quiz7);
		this.service.saveQuiz(quiz8);
		this.service.saveQuiz(quiz9);
		this.service.saveQuiz(quiz10);
		System.out.println("Database has been initialized");
		
	}

}
