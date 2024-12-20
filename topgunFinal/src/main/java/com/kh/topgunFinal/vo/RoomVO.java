package com.kh.topgunFinal.vo;

import java.sql.Timestamp;

import com.kh.topgunFinal.dto.AirlineDto;

import lombok.Data;

@Data
public class RoomVO { 
	private int roomNo;
	private String roomName;
	private Timestamp roomCreated;
	private String roomCreatedBy; 
	private String join; //채팅방 입장 여부를 알기 위해 추가
	private String lastMessage;
	private Timestamp lastMessageTime;
}
