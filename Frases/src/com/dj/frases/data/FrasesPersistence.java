package com.dj.frases.data;

import java.util.List;

import com.dj.frases.model.Frase;

public interface FrasesPersistence {
	public void saveFrase(Frase frase);
	public List<Frase> getAllFrases();
}
