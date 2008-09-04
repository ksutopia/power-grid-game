/*
 * Created on 29/03/2008
 */
package com.andrewswan.powergrid.services.impl;

import java.io.File;

import com.andrewswan.powergrid.Utils;
import com.andrewswan.powergrid.domain.Game;
import com.andrewswan.powergrid.services.GameService;

/**
 * Implementation of the {@link GameService}
 */
public class GameServiceImpl implements GameService {

  public Game load(String directoryName, String fileName) {
    File file = getFile(directoryName, fileName);
    
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns the file specified by the given directory and file names
   * 
   * @param directoryName must be a valid path
   * @param fileName must be a readable file in that directory
   */
  private File getFile(String directoryName, String fileName) {
    Utils.checkNotNull(directoryName, fileName);
    File directory = new File(directoryName);
    if (!directory.isDirectory()) {
      throw new IllegalArgumentException(
          "Invalid directory '" + directoryName + "'");
    }
    File file = new File(directory, fileName);
    if (!file.canRead()) {
      throw new IllegalArgumentException("Invalid file '" + fileName + "'");
    }
    return file;
  }

  public void save(Game game, String directory, String fileName) {
    // TODO Auto-generated method stub

  }

}