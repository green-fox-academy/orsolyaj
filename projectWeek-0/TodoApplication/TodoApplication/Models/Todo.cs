using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TodoApplication.Models
{
    public class Todo
    {
        public long TodoId { get; set; }
        public string Name { get; set; }
        public bool Urgent { get; set; }
        public bool Done { get; set; }
    }
}
