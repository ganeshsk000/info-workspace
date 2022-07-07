package com.project.comparator;

import java.util.Comparator;

import com.project.dto.ArtifactDTO;

public class SortArtifactByName implements Comparator<ArtifactDTO> {

	@Override
	public int compare(ArtifactDTO o1, ArtifactDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
