package com.vindixit.toggl.service;

import com.vindixit.toggl.model.TimeEntry;

public class WorkShifts {

	public int getStartFirstShift(TimeEntry[] timeEntries) {
		// Pretendemos um algoritmo de ordena��o.
		// Um valor m�ximo para hora para iniciarmos
		// o algoritmo, pode ser o numero 25 (mesmo irreal).
		
		
		// declarar uma vari�vel auxiliar e inicializ�-la com um valor imediatamente acima dos n�meros poss�veis para hor�rio.
		// coloquei 1000, mas est� errado por n�o ser o valor imediatamente acima das op��es de horas poss�veis. CORRIGIR ISSO.
		int least = 1000;
		// Iterar o array de timeEntries e comparar a vair�vel auxiliar com a menor hora de um TimeEntry.
		//for ...
			//int start = timeEntries[i].getStart();
			// comparar utilizando a estrutura IF
			//if(...){
				// substituir o valor da vari�vel auxiliar pela menor hora do TimeEntry iterado.
				//... 
			//}
		//}
		// retornar a vari�vel auxiliar.
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
