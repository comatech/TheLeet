/*
 * ChatMessage.java
 *
 *************************************************************************
 * Copyright 2010 Christofer Engel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rubika.aotalk.item;

import java.util.Comparator;

public class TowerSite {
    private int id;
    private int zoneId;
    private String zone;
    private String faction;
    private String sitename;
    private int minlevel;
    private int maxlevel;
    private long lastresult;
    
    public TowerSite() {
    }
    
    public TowerSite(int id, int zoneId, String zone, String faction, String sitename, int minlevel, int maxlevel, long lastresult) {
	    super();
	    this.zoneId = zoneId;
	    this.zone = zone;
	    this.id = id;
	    this.faction = faction;
	    this.sitename = sitename;
	    this.minlevel = minlevel;
    	this.maxlevel = maxlevel;
    	this.lastresult = lastresult;
    }
    
    public int getId() {
    	return this.id;
    }
    
    public int getZoneId() {
    	return this.zoneId;
    }
    
    public String getZone() {
    	return this.zone;
    }
    
    public String getFaction() {
    	return this.faction;
    }
    
    public String getSitename() {
    	return this.sitename;
    }
    
    public int getMinlevel() {
    	return this.minlevel;
    }
    
    public int getMaxlevel() {
    	return this.maxlevel;
    }
    
    public long getLastresult() {
    	return this.lastresult;
    }
	
	public static class CustomComparator implements Comparator<TowerSite> {
	    @Override
	    public int compare(TowerSite site1, TowerSite site2) {
	        return site1.getZone().compareTo(site2.getZone());
	    }
	}
}