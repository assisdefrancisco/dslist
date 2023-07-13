package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class GameListDto {

	private Long id;
	private String name;
	
	public GameListDto(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
}
