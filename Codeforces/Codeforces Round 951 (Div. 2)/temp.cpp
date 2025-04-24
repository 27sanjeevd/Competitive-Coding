int val() {
    return 0;
}

int (*ptr())() {
    return val;
}

struct Obj {
    int operator()() {
        return 0;
    }
};

Obj obj() {
    return Obj{};
}

auto lambda() {
    return [](){
        return 0;
    };
}

int main() {
    return !(ptr()() == obj()() == lambda()());
}