package com.vindixit.toggl.service;

import com.vindixit.toggl.model.TimeEntry;

public class WorkShifts {

	public int getStartFirstShift(TimeEntry[] timeEntries) {
		// Pretendemos um algoritmo de ordenação.
		// Um valor máximo para hora para iniciarmos
		// o algoritmo, pode ser o numero 25 (mesmo irreal).
		
		
		// declarar uma variável auxiliar e inicializá-la com um valor imediatamente acima dos números possíveis para horário.
		// coloquei 1000, mas está errado por não ser o valor imediatamente acima das opções de horas possíveis. CORRIGIR ISSO.
		int least = 1000;
		// Iterar o array de timeEntries e comparar a vairável auxiliar com a menor hora de um TimeEntry.
		//for ...
			//int start = timeEntries[i].getStart();
			// comparar utilizando a estrutura IF
			//if(...){
				// substituir o valor da variável auxiliar pela menor hora do TimeEntry iterado.
				//... 
			//}
		//}
		// retornar a variável auxiliar.
		return least;
	}

	public int getEndFirstShift(TimeEntry[] timeEntries) {
		return 0;
	}

	public int getStartSecondShift(TimeEntry[] timeEntries) {
		return 0;
	}

	public int getEndSecondShift(TimeEntry[] timeEntries) {
		return 0;
	}

}
