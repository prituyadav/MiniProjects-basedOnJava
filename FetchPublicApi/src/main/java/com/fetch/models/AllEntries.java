package com.fetch.models;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllEntries {
	
	@JsonProperty("count")
   private Long count;
   
//	@JsonProperty("entries")
//   private Entry[] allEntries;
   
	@JsonProperty("entries")
      private List<Entry> allEntries;
	
	
	
}
