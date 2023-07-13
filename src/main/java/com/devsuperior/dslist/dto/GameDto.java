package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameDto {

	private Long id;

	private String title;
	
	private Integer year;
	
	private String genre;
	
	private String platforms;
	
	private Double score;

	private String imgUrl;
	
	private String shortDescription;
	
	private String longDescription;
	
	
	public GameDto(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	
}
