package com.devsuperior.dslist.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EqualsAndHashCode.Include
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;
	
	public Belonging(Game game, GameList list, Integer position) {
		this.id.setGame(game);
		this.id.setList(list);		
		this.position = position;
	}
}
