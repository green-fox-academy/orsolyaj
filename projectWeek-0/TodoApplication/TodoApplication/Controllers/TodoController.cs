using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApplication.Models;
using TodoApplication.Services;

namespace TodoApplication.Controllers
{
    public class TodoController : Controller
    {
        private readonly ITodoService todoService;

        public TodoController(ITodoService todoService)
        {
            this.todoService = todoService;
        }

        [HttpGet("/")]
        public IActionResult Index()
        {
            var todos = todoService.FindAll();

            return View(todos);
        }

        [HttpGet("/Todo/Add")]
        public IActionResult AddTodo()
        {
            return View();
        }

        [HttpPost("/Todo/Add")]
        public IActionResult CreateTodo(Todo newTodo)
        {
            todoService.Add(newTodo);

            return RedirectToAction("Index", "Todo");
        }

        [HttpPost("/Todo/Delete")]
        public IActionResult DeleteTodo(long id)
        {
            var todo = todoService.FindById(id);

            todoService.Delete(todo);

            return RedirectToAction("Index", "Todo");
        }

        [HttpPost("/Todo/Update")]
        public IActionResult RenderUpdateTodo([FromQuery(Name = "id")] long id)
        {
            var todo = todoService.FindById(id);

            return View(todo);
        }
        
        [HttpPost("/Todo")]
        public IActionResult UpdateTodo(Todo todo, long id)
        {
            todo.TodoId = id;
            todoService.Update(todo);

            return RedirectToAction("Index", "Todo");
        }
        
    }

}
