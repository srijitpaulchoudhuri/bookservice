import org.springframework.cloud.contract.spec.Contract;
Contract.make { 
	
	description("Get one book by id")
	request{
		
		method("GET")
		urlPath("/api/books/1")
	}
	response{
	
		status OK()
		headers { 
			header 'Content-Type':'application/json'
		}	
		body(file("response.json"))
	}
	
	
}