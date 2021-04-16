def validate_pin(pin):
    if (len(pin) == 4 or len(pin) == 6) and all([s.isdigit() == True for s in pin]):
        return True
    else:
        return False
