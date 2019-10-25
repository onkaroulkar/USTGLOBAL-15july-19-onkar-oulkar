package com.dev.project;

import java.sql.SQLException;

public interface Musicplayr {

	void playAllSong() throws Exception;
	void playSongRandomly() throws ClassNotFoundException, SQLException;
	void playPerticularSong() throws ClassNotFoundException, SQLException;
	void searchSong() throws ClassNotFoundException, SQLException, Exception;
	void showAllSong() throws Exception;
	void addSong() throws Exception;
	void editeSong() throws Exception;
	void deleteSong() throws Exception;
}
