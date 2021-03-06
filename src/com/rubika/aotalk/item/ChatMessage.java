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

import com.rubika.aotalk.util.ChatParser;
import com.rubika.aotalk.util.Statics;

public class ChatMessage {
    private String message;
    private long timestamp;
    private String character;
    private String channel;
    private long id;
    private boolean doAnimation = true;
	private String icon;
    
    // Constructor for the ChatMessage class
    public ChatMessage() {
    }
    
    // Constructor for the ChatMessage class
    public ChatMessage(long timestamp, String message, String character, String channel, int id) {
	    super();
	    this.message   = message;
	    this.timestamp = timestamp;
	    this.character = character;
	    this.channel   = channel;
	    this.id 	   = id;
    }
    
    // Getter and setter methods for all the fields.
    public String getMessage() {
    	return message;
    }
    
    public void setMessage(String message) {
    	this.message = message;
    }
    
    public long getId() {
    	return id;
    }
    
    public void setId(long id) {
    	this.id = id;
    }
    
    public long getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public String getCharacter() {
        return character;
    }

	public void setCharacter(String character) {
		this.character = character;
	}
    
    public String getChannel() {
        return channel;
    }

	public void setChannel(String channel) {
		this.channel = channel;
	}
    
	public int getType() {
		return getType(this.channel);
	}
	
    public static int getType(String channel) {
    	int type = ChatParser.MESSAGE_TYPE_GROUP;
        
	    if (channel != null) {
	    	if (channel.equals(Statics.CHANNEL_PRIVATE)) {
		    	type = ChatParser.MESSAGE_TYPE_PG;
		    } else if (channel.equals(Statics.CHANNEL_SYSTEM)) {
		    	type = ChatParser.MESSAGE_TYPE_SYSTEM;
		    } else if (channel.equals(Statics.CHANNEL_PM)) {
		    	type = ChatParser.MESSAGE_TYPE_PRIVATE;
		    } else if (channel.equals(Statics.CHANNEL_FRIEND)) {
		    	type = ChatParser.MESSAGE_TYPE_FRIEND;
		    } else if (channel.equals(Statics.CHANNEL_APPLICATION)) {
		    	type = ChatParser.MESSAGE_TYPE_CLIENT;
		    }
	    }
	    
    	return type;
    }
	
	public boolean showAnimation() {
		return this.doAnimation;
	}
	
	public void showAnimation(boolean doAnimation) {
		this.doAnimation = doAnimation;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
}