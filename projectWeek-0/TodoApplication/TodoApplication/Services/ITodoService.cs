using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApplication.Models;

namespace TodoApplication.Services
{
    public interface ITodoService
    {
        List<Todo> FindAll();
        Todo FindById(long id);
        void Add(Todo todo);
        void Update(Todo todo);
        void Delete(Todo todo);
    }
}
