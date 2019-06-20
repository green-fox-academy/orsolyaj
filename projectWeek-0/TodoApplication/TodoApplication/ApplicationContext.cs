using Microsoft.EntityFrameworkCore;
using TodoApplication.Models;

namespace TodoApplication
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Todo> Todos { get; set; }
        public ApplicationContext(DbContextOptions options) : base(options)
        {
        }
    }
}
