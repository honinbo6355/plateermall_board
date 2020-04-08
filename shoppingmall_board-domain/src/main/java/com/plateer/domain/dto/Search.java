package com.plateer.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Search {
	
	private String searchType;
	private String keyword;

}
