/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.visualization.client.events;

import com.google.gwt.visualization.client.Properties;

/**
 * This class handles onmouseout events for visualizations such as 
 * browsercharts.
 */
public abstract class OnMouseOutHandler extends Handler {
  /**
   * The onmouseout event is fired when the mouse is out of data displayed in 
   * the visualization.
   */
  public static class OnMouseOutEvent {
    private int row;
    private int column;

    public OnMouseOutEvent(int row, int column) {
      this.row = row;
      this.column = column;
    }

    public int getColumn() {
      return column;
    }
    
    public int getRow() {
      return row;
    }
  }

  public abstract void onMouseOutEvent(OnMouseOutEvent event);
  
  @Override
  protected void onEvent(Properties properties) {
    int row = properties.getInt("row");
    int column = properties.getInt("column");
    onMouseOutEvent(new OnMouseOutEvent(row, column));
  }
}