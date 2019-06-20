using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApplication.Models;

namespace TodoApplication.Services
{
    public class TodoService : ITodoService
    {
        private ApplicationContext applicationContext;

        public TodoService(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }

        public void Add(Todo todo)
        {
            applicationContext.Add(todo);

            applicationContext.SaveChanges();
        }

        public void Delete(Todo todo)
        {
            applicationContext.Remove(todo);

            applicationContext.SaveChanges();
        }

        public List<Todo> FindAll()
        {
           return applicationContext.Todos.ToList();
        }

        public Todo FindById(long id)
        {
            return applicationContext.Todos.SingleOrDefault(todo => todo.TodoId == id);
        }

        public void Update(Todo todo)
        {
            applicationContext.Update(todo);
            applicationContext.SaveChanges();
        }
    }
}
