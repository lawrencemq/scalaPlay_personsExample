$ ->
	$.get "/persons", (persons) ->
		$.each persons, (index, person) ->
			$("#per").append $("<li>").text person.name