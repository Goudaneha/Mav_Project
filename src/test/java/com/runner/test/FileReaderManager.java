package com.runner.test;

import com.utility.test.ConfigReader;

public class FileReaderManager {

		private static FileReaderManager fileReaderManager = new FileReaderManager();
		private static ConfigReader configFileReader;

		private FileReaderManager() {
		}

		 public static FileReaderManager getInstance( ) {
		      return fileReaderManager;
		 }

		 public ConfigReader getConfigReader() {
			 return (configFileReader == null) ? new ConfigReader() : configFileReader;
		 }
	}
