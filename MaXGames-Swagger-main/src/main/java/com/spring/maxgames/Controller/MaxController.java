package com.spring.maxgames.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.maxgames.AuthModel.Auth;
import com.spring.maxgames.DataModel.Data;
import com.spring.maxgames.Service.MaxService;

import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/api")
public class MaxController {

	@Autowired
	private MaxService servicex;
	
	//Auth
	@Tag(name = "Login Method",description = "User Validation")
	@PostMapping("/auth/login")
	private String Login(@RequestBody Map<String, String> Loginx) {
	    String usernamex = Loginx.get("usernamex");
	    String passwordx = Loginx.get("passwordx");
	    String result = servicex.Loginx(usernamex, passwordx);
	    return result;
	}
	@GetMapping("/auth/users")
	private List<Auth> Users() {
		return servicex.Users();
	}
	@Tag(name = "Signup Method",description = "/")
	@PostMapping("/auth/signup")
	private Auth SignUp(@RequestBody Auth userx) {
		return servicex.SignUpx(userx);
	}
	
	//Data
	@GetMapping("/games")
	private List<Data> Games(){
		return servicex.Games();
	}
	@GetMapping("/game/{id}")
	private Optional<Data> viewGame(@PathVariable Long id) {
		return servicex.viewGame(id);
	}
	@PostMapping("/game")
	private Data addGame(@RequestBody Data gamex) {
		return servicex.addGame(gamex);
	}
	@PutMapping("/game/{id}")
	private Data editGame(@PathVariable Long id, @RequestBody Data gamex) {
		return servicex.editGame(gamex, id);
	}
	@DeleteMapping("/game/{id}")
	private String deleteGame(@PathVariable Long id) {
		return servicex.deleteGame(id);
	}
	@GetMapping("/game/x/a/{field}")
	private List<Data> sortGamesA(@PathVariable("field") String field) {
		return servicex.sortGameA(field);
	}
	@GetMapping("/game/x/d/{field}")
	private List<Data> sortGamesD(@PathVariable("field") String field){
		return servicex.sortGameD(field);
	}
	@GetMapping("/game/x/{offset}/{size}")
	private List<Data> pageGames(@PathVariable("offset") int offset, @PathVariable("size") int size){
		return servicex.pagingGames(offset, size);
	}
	@GetMapping("/game/x/{offset}/{size}/{field}")
	private List<Data> sortpageGames(@PathVariable("offset") int offset,@PathVariable("size") int size,@PathVariable("field") String field ){
		return servicex.pagingsortingGames(offset, size, field);
	}
}
