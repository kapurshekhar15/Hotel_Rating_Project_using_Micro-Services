package com.lcwd.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user_rating")
public class Rating {
	@Id
	@Column(name = "ID")
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
}
