package com.keitaitoys.fonteditor.io;

public class FontReadFailedException extends Exception {

	//////////////////////////////////////////////////////////////////////
	// Description ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////
	// Consts ////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////
	// Variables /////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	private String fileName;

	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException() {
		super();
	}
	
	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(String message) {
		super(message);
	}
	
	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(Throwable cause) {
		super(cause);
	}
	
	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(String message, String fileName) {
		
		super(message);
		this.fileName = fileName;
	}

	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(Throwable cause, String fileName) {

		super(cause);
		this.fileName = fileName;
	}
	
	//////////////////////////////////////////////////////////////////////
	// Constructor ///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////

	public FontReadFailedException(String message, String fileName, Throwable cause) {

		super(message, cause);
		this.fileName = fileName;
	}
	
	//////////////////////////////////////////////////////////////////////
	// Functions ///////////////////////////////////////////////////////// 
	//////////////////////////////////////////////////////////////////////
	
	public String getFileName() {
		
		return fileName;
	}
}